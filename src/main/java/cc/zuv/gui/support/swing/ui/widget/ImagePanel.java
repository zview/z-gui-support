/*
 * Id$: zuv-cloud:z-gui-support:cc.zuv.swing.ui.ImagePanel:20190711163619
 *
 * ImagePanel.java
 * Copyright (c) 2002-2020 Luther Inc.
 * http://zuv.cc
 * All rights reserved.
 */
package cc.zuv.gui.support.swing.ui.widget;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * 带背景图片的Panel
 *
 * @author          Kama Luther
 * @version         0.1
 * @since           0.1
 * @create.date     2018-08-17 21:33
 * @modify.date     2018-08-17 21:33
 */
public class ImagePanel extends JPanel
{

    //-----------------------------------------------------------------------------------------

    private static final long serialVersionUID = -4031673321089705402L;

    //-----------------------------------------------------------------------------------------

    public static final String CENTRE = "Centre";   //居中
    public static final String TILED  = "Tiled";    //平铺
    public static final String SCALED = "Scaled";   //拉伸

    //-----------------------------------------------------------------------------------------

    private Image  m_bgimage;    //背景图片
    private String m_mode;   	 //背景图片显示模式
    private int    m_modeindex;  //背景图片显示模式索引


    /**
     * 构造一个没有背景图片的ImagePanel
     */
    public ImagePanel()
    {
    	this(null, CENTRE);
    }
    
    /**
     * 构造一个具有指定背景图片的默认居中模式的ImagePanel
     */
	public ImagePanel(Image image)
	{
		this(image, CENTRE);
	}

    /**
     * 构造一个具有指定背景图片和指定显示模式的ImagePanel
     * @param image 背景图片
     * @param modename 背景图片显示模式
     */
	public ImagePanel(Image image, String modename)
	{
        super();
        setBackgroundImage(image);
        setImageDisplayMode(modename);
	}

	//-----------------------------------------------------------------------------------------

    /**
     * 设置背景图片
     * @param image 背景图片
     */
    public void setBackgroundImage(Image image)
    {
        this.m_bgimage = image;
        this.repaint();
    }
	
    /**
     * 获取背景图片
     * @return 背景图片
     */
    public Image getBackgroundImage()
    {
        return m_bgimage;
    }
	
    /**
     * 设置背景图片显示模式
     * @param modeName 模式名称，取值仅限于ImagePanel.TILED  ImagePanel.SCALED  ImagePanel.CENTRE
     */
    public void setImageDisplayMode(String modeName)
    {
        if(modeName != null)
        {
            modeName = modeName.trim();
            
            //居中
            if(modeName.equalsIgnoreCase(CENTRE))
            {
                this.m_mode = CENTRE;
                m_modeindex = 0;
            }
            //平铺
            else if(modeName.equalsIgnoreCase(TILED))
            {
                this.m_mode = TILED;
                m_modeindex = 1;
            }
            //拉伸
            else if(modeName.equalsIgnoreCase(SCALED))
            {
                this.m_mode = SCALED;
                m_modeindex = 2;
            }
            
            this.repaint();
        }
    }

    /**
     * 获取背景图片显示模式
     * @return 显示模式
     */
    public String getImageDisplayMode()
    {
        return m_mode;
    }    
	
	//-----------------------------------------------------------------------------------------

	@Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        //如果设置了背景图片则显示
        if (m_bgimage != null)
        {
            int width = this.getWidth();
            int height = this.getHeight();
            int imageWidth = m_bgimage.getWidth(this);
            int imageHeight = m_bgimage.getHeight(this);

            switch (m_modeindex)
            {
                //居中
                case 0:
                {
                    int x = (width - imageWidth) / 2;
                    int y = (height - imageHeight) / 2;
                    g.drawImage(m_bgimage, x, y, this);
                    break;
                }
                //平铺
                case 1:
                {
                    for (int ix = 0; ix < width; ix += imageWidth)
                    {
                        for (int iy = 0; iy < height; iy += imageHeight)
                        {
                            g.drawImage(m_bgimage, ix, iy, this);
                        }
                    }
                    break;
                }
                //拉伸
                case 2:
                {
                    g.drawImage(m_bgimage, 0, 0, width, height, this);
                    break;
                }
            }
        }
    }

	//-----------------------------------------------------------------------------------------

}
